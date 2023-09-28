using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace desktopowa {
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window {

        private String currentType = "";
        public MainWindow() {
            InitializeComponent();
        }

        private void checkPrice(object sender, RoutedEventArgs e) {
            switch (currentType.ToLower()) {
                case "pocztówka":
                    price.Text = "Cena: 1zł";
                    image.Source = new BitmapImage(new Uri(@"/pocztowka.png", UriKind.RelativeOrAbsolute));
                    break;
                case "list":
                    price.Text = "Cena: 1,5zł";
                    image.Source = new BitmapImage(new Uri(@"/list.png", UriKind.RelativeOrAbsolute));
                    break;
                case "paczka":
                    price.Text = "Cena: 10zł";
                    image.Source = new BitmapImage(new Uri(@"/paczka.png", UriKind.RelativeOrAbsolute));
                    break;
                default:
                    price.Text = "Cena: ";
                    break;
            }
        }

        private void changeCurrent(object sender, RoutedEventArgs e) {
            RadioButton clicked = sender as RadioButton;
            if (clicked == null)
                return;
            if (clicked.IsChecked == true)
                currentType = clicked.Content.ToString();
        }

        private void submit(object sender, RoutedEventArgs e) {
            // Lepsze rozwiązanie
            /*
            if (!Regex.Match(zipCode.Text.ToString(), @"^\d{2}-\d{3}$").Success) {
                MessageBox.Show("Błąd", "Kod pocztowy jest nieprawidłowy, XX-XXX", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }
             */
            if (!int.TryParse(zipCode.Text, out int zip)) {
                MessageBox.Show("Kod pocztowy powinien się składać z samych cyfr", "Błąd", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }
            if (zip < 10000 || zip > 99999) {
                MessageBox.Show("Nieprawidłowa liczba cyfr w kodzie pocztowym", "Błąd", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }

            MessageBox.Show("Dane przesyłki zostały wprowadzone", "Wysłane", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }
}

   M S B A M L   `   `   `  ����E  Adesktopowa, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null'clr-namespace:desktopowa
desktopowa  5   	       desktopowa.MainWindow   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   *localclr-namespace:desktopowa     5   	     � Title$+  %Nadaj Przesyłkę, PESEL: 00000000000��5   	    � SizeToContent$ WidthAndHeight=�65   .��5	      �� $��20q�6   .+�5
   
   A�  A� Columns$ 2��6   .+�5      �� .+�5      �� -   5         ��Name$
 type��5   ?   $��Rodzaj paczki��6   $
��Auto��62   .��5      �� .+�5      	� -   5         	� 	GroupName$
 type��5   &   $��
Pocztówka��68    d� 	IsChecked$
 TrueY�6L   6]   	� 5      -   5        $
 type��5   &   $
��List��67   6F   	� 5      -   5        $
 type��5   &   $��Paczka��67   6H   5      5      �� 5      -   5        $��Sprawdź cenę��5      60   �� 5       �� Orientation$ 
Horizontal=�6   .+�5      �� -   5         ��Name$ image��5      $��/pocztowka.png��6+   $
��None=�6C   �� 5      -   5         ��Name$ price��5       $
��Bold"�6/   $��24(�6A   $��Cena: ��6O   	 �� Padding$	 50q�6]   5      5      �� 5      $��Dane adresowe��6   .��5      �� .+�5      �� $��Ulica z numerem��6   �� 5      -   5        
 ��Name$
 street��5      �� 5      $��Kod pocztowy��6   �� 5       -	   5        $
 zipCode��5       �� 5!      $��Miasto��6   �� 5"      -
   5        $

 city��5"      5#      5$      5%      �� 5&   
   -   5        $��
Zatwierdź��5&      6%   5'      5(      
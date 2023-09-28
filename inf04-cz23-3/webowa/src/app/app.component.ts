import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  form = {
    tytul: '',
    kategoria: '',
  };

  submited() {
    console.log(this.form);
  }
}

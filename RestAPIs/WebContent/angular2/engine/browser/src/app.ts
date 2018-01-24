import {Component} from '@angular/core';

@Component({
  selector: 'my-app',
  template: `
    <div>
      {{ text }}
    </div>
  `
})
export default class App {
  public text: string;
  constructor() {
    this.text = 'Hello world!';
  }
}
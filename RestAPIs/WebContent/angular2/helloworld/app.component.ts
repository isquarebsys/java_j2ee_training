import { Component,OnInit } from '@angular/core';
import { Hero } from './hero';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
	results: string;
  title = 'Welcome to Angular 2';
   // Inject HttpClient into your component or service.
  constructor(private http: HttpClient) {}
  heroes = [
	new Hero(1, 'Windstorm'),
	new Hero(20, 'Tornado')
	];
	myHero = this.heroes[0];
	
	ngOnInit(): void {
    // Make the HTTP request:
    this.http.get('http://localhost:8080/rest/jersey/message').subscribe(data => {
      // Read the result field from the JSON response.
      this.results = data['firstName'];
	  console.log("results: "+results);
    });
  }
}

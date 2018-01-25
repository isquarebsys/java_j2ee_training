import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Person } from './person';

@Injectable()
export class PeopleService {
  // private baseUrl: string = 'http://swapi.co/api';
  // http://swapi.co/api doesnt allow cross origin scripting, so lets use a local api
  private baseUrl: string = 'http://localhost:8080/RestAPIs/jersey/people';
  // For Json structure, see people.json
  constructor(private http : Http){
  }

  getAll(): Observable<Person[]>{
    let people$ = this.http
      .get(`${this.baseUrl}`, {headers: this.getHeaders()})
      .map(mapPersons);
      return people$;
  }

  private getHeaders(){
    // I included these headers because otherwise FireFox
    // will request text/html instead of application/json
    let headers = new Headers();
    headers.append('Accept', 'application/json');
    return headers;
  }
  
  function mapPersons(response:Response): Person[]{
   // The response of the API has a results
   // property with the actual results
   return response.json().results.map(toPerson);
}

function toPerson(r:any): Person{
  let person = <Person>({
    id: extractId(r),
    url: r.url,
    name: r.name,
    weight: Number.parseInt(r.mass),
    height: Number.parseInt(r.height),
  });
  console.log('Parsed person:', person);
  return person;
}

// to avoid breaking the rest of our app
// I extract the id from the person url
// that's because the Starwars API doesn't have an id field
function extractId(personData:any){
 let extractedId = personData.url.replace('http://swapi.co/api/people/','').replace('/','');
 return parseInt(extractedId);
}
}

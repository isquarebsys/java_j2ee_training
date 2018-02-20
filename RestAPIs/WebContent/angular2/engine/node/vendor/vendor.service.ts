import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Vendor } from './vendor';

@Injectable()
export class VendorService {
  private baseUrl: string = 'http://localhost:9090/vendors';
  // For Json structure, see people.json
  constructor(private http : Http){
  }

  getAll(): Observable<Vendor[]>{
    let vendors$ = this.http
      .get(`${this.baseUrl}`, {headers: this.getHeaders()})
      .map(mapVendors);
      return vendors$;
  }

  private getHeaders(){
    // I included these headers because otherwise FireFox
    // will request text/html instead of application/json
    let headers = new Headers();
    headers.append('Accept', 'application/json');
    return headers;
  }
  
  function mapVendors(response:Response): Vendor[]{
   // The response of the API has a results
   // property with the actual results
   //return response.json().results.map(toVendor);
   return response.json().map(toVendor);
}

function toVendor(r:any): Vendor{
  let vendor = <Vendor>({
    id: extractId(r),
    url: r.url,
    firstName: r.firstName,
  lastName: r.lastName
  });
  console.log('Parsed vendor:', vendor);
  return vendor;
}

// to avoid breaking the rest of our app
// I extract the id from the vendor url
// that's because the Starwars API doesn't have an id field
function extractId(vendorData:any){
 // let extractedId = vendorData.url.replace('http://swapi.co/api/people/','').replace('/','');
 // This is throwing error
 let extractedId="2";
 return parseInt(extractedId);
}
}

import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable()
export class ProductService {
private baseUrl: string = 'http://localhost:9090/products';
 // Json structure: [{"id":1,"name":"Product 1","cost":"100"}]
  constructor(private http : Http){
  }

  getAll(): Observable<Product[]>{
    let products$ = this.http
      .get(`${this.baseUrl}`, {headers: this.getHeaders()})
      .map(mapProduct);
      return products$;
  }

  private getHeaders(){
    // I included these headers because otherwise FireFox
    // will request text/html instead of application/json
    let headers = new Headers();
    headers.append('Accept', 'application/json');
    return headers;
  }
  
  function mapProduct(response:Response): Product[]{
   // The response of the API has a results
   // property with the actual results
   //return response.json().results.map(toProduct);
   return response.json().map(toProduct);
}

function toProduct(r:any): Product{
  let product = <Product>({
    id:r.id,
    name: r.name,
	cost: r.cost
  });
  console.log('Parsed product:', product);
  return product;
}

// to avoid breaking the rest of our app
// I extract the id from the product url
// that's because the Starwars API doesn't have an id field
function extractId(productData:any){
 // let extractedId = productData.url.replace('http://swapi.co/api/people/','').replace('/','');
 // This is throwing error
 let extractedId="2";
 return parseInt(extractedId);
}

}

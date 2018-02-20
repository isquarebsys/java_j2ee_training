import { Component, OnInit } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  template: `
  <!-- this is the new syntax for ng-repeat -->
	<div class="table-responsive" id="form_details" align="center">
		<table>
			<tr *ngFor="let product of products">
				<td (click)="selectProduct(product)">{{product.id}} </td>
			</tr>
		</table>
	</div>


  <section *ngIf="selectedProduct">
    <h2>You selected:  {{selectedProduct.id}}</h2>
    <h3>Description</h3>
    <p>
       {{selectedProduct.name}} {{selectedProduct.cost}}
    </p>
  </section>
  `
})
export class ProductListComponent implements OnInit {

  selectedProduct: Product;

  constructor(private productService : ProductService){ }

  ngOnInit(){
    //this.product = this.productService.getAll();
    this.productService
        .getAll()
        .subscribe(p => this.product = p);
  }

  selectProduct(product: Product){
    this.selectedProduct = product;
  }

}

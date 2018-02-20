import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  template: `
  <!-- this is the new syntax for ng-repeat -->
	<div class="table-responsive" id="form_details" align="center">
		<table class="table-responsive" border="1">
			<tr>
				<td>Product Id</td>
				<td>Product Name</td>
				<td>Product Cost</td>
			</tr>
			<tr *ngFor="let product of products">
				<td (click)="selectProduct(product)">{{product.id}} </td>
				<td (click)="selectProduct(product)">{{product.name}} </td>
				<td (click)="selectProduct(product)">{{product.cost}} </td>
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
    // NOTE: in subscribe, this.products should be products
    this.productService
        .getAll()
        .subscribe(p => this.products = p);
		
		
  }

  selectProduct(product: Product){
    this.selectedProduct = product;
  }

}

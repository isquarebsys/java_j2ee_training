import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  template: `
  <!-- this is the new syntax for ng-repeat -->
  <div class="jumbotron" style="background-color:#FFFFFF;">
		<div class="table-responsive" id="form_details" align="center">
			<table class="table table-responsive table-bordered" align="center">
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

			<form action="#" *ngIf="selectedProduct">
			  <div class="form-group">
				<label for="product_id">Product ID:</label>
				<input type="text" class="form-control" id="product_id" value="{{selectedProduct.id}}">
			  </div>
			  <div class="form-group">
				<label for="product_name">Product Name:</label>
				<input type="text" class="form-control" id="product_name" value="{{selectedProduct.name}}">
			  </div>
			  <div class="form-group">
				<label for="product_cost">Product Cost:</label>
				<input type="text" class="form-control" id="product_cost" value="{{selectedProduct.cost}}">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>
			
			<!--
			<div class="well">
			  <section >
				<p>
				   <li>Product Name: {{selectedProduct.name}} 
				   <li>Product Cost: {{selectedProduct.cost}}
				</p>
			  </section>			
		  </div>
		  -->
		</div>
  </div>
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

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
				<thead>
					<tr>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Product Cost</th>
					</tr>
				</thead>
				<tbody>
					<tr *ngFor="let product of products">
						<td (click)="selectProduct(product)">{{product.id}} </td>
						<td (click)="selectProduct(product)">{{product.name}} </td>
						<td (click)="selectProduct(product)">{{product.cost}} </td>
					</tr>
				</tbody>
			</table>
			
			<!-- productForm is the variable name for the form and can be used within submitting the form-->
			<form action="#" *ngIf="selectedProduct" #productForm="ngForm" (ngSubmit)="onSubmit()">
			  <div class="form-group">
				<label for="product_id">Product ID:</label>
				<input type="text" class="form-control" name="product_id"  required [(ngModel)]="selectedProduct.id" [ngModelOptions]="{standalone: true}" #spy>
				<font color="red"><br>TODO: remove this: {{spy.className}}</font>
			  </div>
			  
			  
			  <div class="form-group">
				<label for="product_name">Product Name:</label>
				<input type="text" class="form-control" name="product_name" required [(ngModel)]="selectedProduct.name" [ngModelOptions]="{standalone: true}">
			  </div>

			  <div class="form-group">
				<label for="product_cost">Product Cost:</label>
				<input type="text" class="form-control" name="product_cost" required [(ngModel)]="selectedProduct.cost" [ngModelOptions]="{standalone: true}">
			  </div>
			  <button type="submit" class="btn btn-success" [disabled]="!productForm.form.valid" (click)="newProduct();">Submit</button>
			</form>
			

			<!-- Elements for showing the results-->
			<div *ngIf="selectedProduct" [hidden]="!submitted">
			  <h2>You submitted the following:</h2>
			  <div class="row">
				<div class="col-xs-3">Name</div>
				<div class="col-xs-9  pull-left">{{ selectedProduct.name }}</div>
			  </div>
			</div>		  
		</div>
  </div>
  `
})
export class ProductListComponent implements OnInit {
	newProduct:Product;
	submitted=false;
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

	onSubmit() { this.submitted = true; }
	
	newProduct() {
		// model is a keyword, the name can NOT be anything ELSE
		this.model  = new Product(42, 'Test', 'Test');
	}
}

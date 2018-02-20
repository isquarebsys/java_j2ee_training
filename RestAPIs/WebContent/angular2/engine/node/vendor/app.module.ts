import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
//import { VendorService } from './vendor.service';
import { ProductService } from './product.service';

import { appRouterModule } from "./app.routes";
//import { VendorListComponent } from './vendor-list/vendor-list.component';
import { ProductListComponent } from './product-list/product-list.component';

@NgModule({
  declarations: [
    AppComponent,
	ProductListComponent
	],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    appRouterModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }

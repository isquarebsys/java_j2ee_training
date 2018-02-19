import { Component, OnInit } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-list',
   template: `
  <!-- this is the new syntax for ng-repeat -->
	<div class="table-responsive" id="form_details" align="center">
		<table>
			<tr *ngFor="let vendor of vendors">
				<td (click)="selectVendor(vendor)">{{vendor.id}} </td>
			</tr>
		</table>
	</div>


  <section *ngIf="selectedVendor">
    <h2>You selected:  {{selectedVendor.id}}</h2>
    <h3>Description</h3>
    <p>
       {{selectedVendor.firstName}} {{selectedVendor.lastName}} {{selectedVendor.email}}
    </p>
  </section>
  `
})
export class VendorListComponent implements OnInit {

selectedVendor: Vendor;

  constructor(private vendorService : VendorService){ }

  ngOnInit(){
    //this.vendor = this.vendorService.getAll();
    this.vendorService
        .getAll()
        .subscribe(p => this.vendor = p);
  }

  selectVendor(vendor: Vendor){
    this.selectedVendor = vendor;
  }

}

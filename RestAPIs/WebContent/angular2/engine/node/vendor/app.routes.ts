import { Routes, RouterModule } from '@angular/router';
//import { PeopleListComponent } from "./people-list/people-list.component";
//import { VendorListComponent } from "./vendor-list/vendor-list.component";
import { ProductListComponent } from "./product-list/product-list.component";

// Route config let's you map routes to components
const routes: Routes = [
  // map '/persons' to the people list component
  {
    path: 'products',
    component: ProductListComponent,
  },
  // map '/' to '/vendors' as our default route
  {
    path: '',
    redirectTo: '/products',
    pathMatch: 'full'
  },
];

export const appRouterModule = RouterModule.forRoot(routes);

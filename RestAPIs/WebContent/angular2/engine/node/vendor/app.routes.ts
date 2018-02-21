import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from "./product-list/product-list.component";
import { NewProductComponent } from "./new-product/new-product.component";

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
   {
    path: 'new_product',
	component: NewProductComponent
  }
];

export const appRouterModule = RouterModule.forRoot(routes);

import { Routes, RouterModule } from '@angular/router';
//import { PeopleListComponent } from "./people-list/people-list.component";
import { VendorListComponent } from "./vendor-list/vendor-list.component";

// Route config let's you map routes to components
const routes: Routes = [
  // map '/persons' to the people list component
  {
    path: 'vendors',
    component: VendorListComponent,
  },
  // map '/' to '/vendors' as our default route
  {
    path: '',
    redirectTo: '/vendors',
    pathMatch: 'full'
  },
];

export const appRouterModule = RouterModule.forRoot(routes);

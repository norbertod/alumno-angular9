import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './navbar/navbar.component';
import { AppRoutingModule } from '../app-routing.module';


//modulo para utilizar con el componente navbar
@NgModule({
  //al crear el componente layout en la carpeta layout se da de alta en este modulo
  //ng g c layout/navbar --skipTests=true
  declarations: [NavbarComponent],
  //se agrega exports:[NavbarComponent] para que otros componentes puedan utilizar NavbarComponent
  exports:[NavbarComponent],
  imports: [
    CommonModule,
    AppRoutingModule //se agrega este modulo para que tome las rutas en el navbar
  ]
})
export class LayoutModule { }

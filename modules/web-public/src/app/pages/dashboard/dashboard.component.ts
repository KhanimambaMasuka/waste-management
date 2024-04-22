import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {GoogleMapsModule} from "@angular/google-maps";

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [GoogleMapsModule],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent implements OnInit{
  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  display: any;
  center: google.maps.LatLngLiteral = {
    lat: -25.8561111,
    lng: 28.1838405
  };
  zoom = 16;

  moveMap(event: google.maps.MapMouseEvent) {
    if (event.latLng != null) this.center = (event.latLng.toJSON());
  }

  move(event: google.maps.MapMouseEvent) {
    if (event.latLng != null) this.display = event.latLng.toJSON();
  }
}

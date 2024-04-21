import {Component, ViewChild} from '@angular/core';
import {NgClass, NgIf} from "@angular/common";
import {
  MatDrawer,
  MatDrawerContainer,
  MatSidenav,
  MatSidenavContainer,
  MatSidenavContent
} from "@angular/material/sidenav";
import {MatListItem, MatNavList} from "@angular/material/list";
import {MatIcon} from "@angular/material/icon";
import {RouterLink, RouterLinkActive, RouterOutlet} from "@angular/router";
import {MatLine} from "@angular/material/core";
import {MatToolbar} from "@angular/material/toolbar";
import {MatIconButton} from "@angular/material/button";
import {BreakpointObserver} from "@angular/cdk/layout";

@Component({
  selector: 'app-layout',
  standalone: true,
  imports: [
    NgIf,
    NgClass,
    MatDrawer,
    MatDrawerContainer,
    MatSidenavContainer,
    MatSidenavContent,
    MatSidenav,
    MatNavList,
    MatListItem,
    MatIcon,
    RouterOutlet,
    RouterLink,
    MatLine,
    MatToolbar,
    MatIconButton,
    RouterLinkActive
  ],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.css'
})
export class LayoutComponent {
  @ViewChild(MatSidenav)
  sidenav!: MatSidenav;
  isMobile = true;

  constructor(private observer: BreakpointObserver) {
  }

  ngOnInit() {
    this.observer.observe(['(max-width: 800px)']).subscribe((screenSize) => {
      this.isMobile = screenSize.matches;
    });
  }

  toggleMenu() {
    this.sidenav.toggle();
  }

  protected readonly open = open;
}

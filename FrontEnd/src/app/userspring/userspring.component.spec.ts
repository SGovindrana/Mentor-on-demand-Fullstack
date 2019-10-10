import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserspringComponent } from './userspring.component';

describe('UserspringComponent', () => {
  let component: UserspringComponent;
  let fixture: ComponentFixture<UserspringComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserspringComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserspringComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

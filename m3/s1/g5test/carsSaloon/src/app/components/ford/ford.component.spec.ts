import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FordComponent } from './ford.component';

describe('FordComponent', () => {
  let component: FordComponent;
  let fixture: ComponentFixture<FordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FordComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

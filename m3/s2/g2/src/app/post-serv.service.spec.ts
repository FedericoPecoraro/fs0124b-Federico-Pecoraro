import { TestBed } from '@angular/core/testing';

import { PostServService } from './post-serv.service';

describe('PostServService', () => {
  let service: PostServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PostServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

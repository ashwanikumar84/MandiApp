package com.jiva.mandi.feature.selling

import androidx.lifecycle.ViewModel
import com.jiva.mandi.core.domain.GetUserNewsResourcesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Inject ViewModel objects with Hilt
 * Provide a viewmodel by annotating with @HiltViewModel and using @Inject annotation in the viewmodel objects constructor.
 *
 * Then, an activity or a fragment that is annotated with @AndroidEntryPoint can get the ViewModel instance as normal
 * using ViewModelProvider or the by viewModels() KTX extensions:
 * for e.g:-
 * @AndroidEntryPoint
 *  class ExampleActivity : AppCompatActivity() {
 *    private val exampleViewModel: ExampleViewModel by viewModels()
 *   ...
 *  }
 */
@HiltViewModel
class SellingViewModel @Inject constructor(getUserNewsResourcesUseCase: GetUserNewsResourcesUseCase) :
    ViewModel() {


    }
package com.jiva.mandi.feature.selling

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.jiva.mandi.core.data.repository.NewsRepository
import com.jiva.mandi.core.domain.GetUserNewsResourcesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.observeOn
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
 *
 */
@HiltViewModel
class SellingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val newsRepository: NewsRepository,
    getUserNewsResourcesUseCase: GetUserNewsResourcesUseCase
) :
    ViewModel() {

    /**
     * https://developer.android.com/topic/architecture/ui-layer/stateholders
     * TODO : need to learn with an example as well
     * Downlaod this sample as well to learn :
     * Reactive UIs using Flow and coroutines for asynchronous operations.
     * important to learn once grip in architecture.
     * https://developer.android.com/topic/architecture/ui-layer/stateholders
     * https://github.com/android/architecture-samples
     */
//    val sellignUiState: StateFlow<SellingUiState>


//    val plant = plantRepository.getPlant(plantId).asLiveData()
//    val newsResource = getUserNewsResourcesUseCase.
    val newsResource = newsRepository.getNewsResources().asLiveData()
}

sealed interface SellingUiState {
    object Loading : SellingUiState
//    data class Success : SellingUiState
}
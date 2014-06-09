using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=234238

namespace BingMapWindowsStoreApp
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        public MainPage()
        {
            this.InitializeComponent();
         //   InitializeMap();
        }

     /*   public async void PerformSearch()
        {
            Bing.Maps.Search.GeocodeRequestOptions requestOptions = new Bing.Maps.Search.GeocodeRequestOptions("1 Microsoft Way, Redmond, WA");

            Bing.Maps.Search.SearchManager searchManager = myMap.SearchManager;
            Bing.Maps.Search.LocationDataResponse response = await searchManager.GeocodeAsync(requestOptions);

            Windows.UI.Popups.MessageDialog dialog = new Windows.UI.Popups.MessageDialog("The best address match is: " + response.LocationData[0].Address.AddressLine);
        }
         
        void InitializeMap()
        {
            myMap.Center = new Location(46.227480, -122.192955);
            myMap.ZoomLevel = 12;
            myMap.MapType = MapType.Aerial;
            myMap.Width = 600;
            myMap.Height = 800;
        }  
        */
        /// <summary>
        /// Invoked when this page is about to be displayed in a Frame.
        /// </summary>
        /// <param name="e">Event data that describes how this page was reached.  The Parameter
        /// property is typically used to configure the page.</param>
        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
        }

        private void RadioButton_Checked(object sender, RoutedEventArgs e)
        {
            rb2.IsChecked = false;
        }

        private void rb2_Checked(object sender, RoutedEventArgs e)
        {
            rb1.IsChecked = false;
        }

        private void bt1_Click(object sender, RoutedEventArgs e)
        {
            if (rb1.IsChecked== true) 
            {

                this.Frame.Navigate(typeof(BlankPage2));
            }
            if (rb2.IsChecked == true)
            {

                this.Frame.Navigate(typeof(BlankPage1));
            }
        }
    }
}

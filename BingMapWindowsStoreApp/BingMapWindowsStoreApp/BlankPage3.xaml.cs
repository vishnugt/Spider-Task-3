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
using Bing.Maps;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=234238

namespace BingMapWindowsStoreApp
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class BlankPage3 : Page
    {
        public BlankPage3()
        {
            this.InitializeComponent();
            
            InitializeMap();
        }

        void InitializeMap()
        {  
              myMap.Center = new Location(lat,lon); 
              myMap.ZoomLevel = 12;
              myMap.MapType = MapType.Aerial;
              myMap.Width = 600;
              myMap.Height = 800;
        }  
    

            Int32 lat, lon;
            //String[] s = new String[2];

          protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            var latlong = e.Parameter as String;
            String[] s = latlong.Split('+');
            lat = Int32.Parse(s[0]);
            lon = Int32.Parse(s[1]);
            
        }
    }
}

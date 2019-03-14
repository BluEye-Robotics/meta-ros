DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "Scott Niekum"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

DEPENDS = "ar-track-alvar-msgs cmake-modules cv-bridge geometry-msgs image-transport message-generation pcl-ros pcl-conversions resource-retriever rospy roscpp sensor-msgs std-msgs tf tf2 libtinyxml visualization-msgs dynamic-reconfigure ar-track-alvar-msgs cv-bridge geometry-msgs image-transport message-runtime pcl-ros pcl-conversions resource-retriever rospy roscpp sensor-msgs std-msgs tf tf2 libtinyxml visualization-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "ar-track-alvar-msgs cv-bridge geometry-msgs image-transport message-runtime pcl-ros pcl-conversions resource-retriever rospy roscpp sensor-msgs std-msgs tf tf2 libtinyxml visualization-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/melodic/ar_track_alvar/0.7.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b1e5d8f2aa503337cd9645b28ea25f3d"
SRC_URI[sha256sum] = "7b822678ef7330b5a3ecf5fd63547162178335534caf6bf4a739ad35c73d91ca"

S = "${WORKDIR}/ar_track_alvar-release-release-melodic-ar_track_alvar-0.7.1-0"

inherit catkin

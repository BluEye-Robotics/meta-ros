DESCRIPTION = "Segmentation Functionality from the RAIL Lab"
AUTHOR = "Russell Toris"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost pkgconfig message-generation pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp boost message-runtime pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp"

RDEPENDS_${PN} = "boost message-runtime pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp"

SRC_URI = "https://github.com/gt-rail-release/rail_segmentation/archive/release/melodic/rail_segmentation/0.1.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b138741076b2347c9ca67033bcbfdfd"
SRC_URI[sha256sum] = "90dbf547d486e651a658a8c6819f15b03c6a0d48cf217a559bd772689a768ed6"

S = "${WORKDIR}/rail_segmentation-release-melodic-rail_segmentation-0.1.15-1"

inherit catkin

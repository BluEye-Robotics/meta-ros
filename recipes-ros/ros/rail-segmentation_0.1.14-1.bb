DESCRIPTION = "Segmentation Functionality from the RAIL Lab"
AUTHOR = "Russell Toris"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost pkgconfig message-generation pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp boost message-runtime pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp"

RDEPENDS_${PN} = "boost message-runtime pcl-conversions pcl-ros roscpp rail-manipulation-msgs roslib sensor-msgs std-srvs tf tf2 tf2-ros yaml-cpp"

SRC_URI = "https://github.com/gt-rail-release/rail_segmentation/archive/release/melodic/rail_segmentation/0.1.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "25f8bf820ca5f9a8cee37281b2bb501e"
SRC_URI[sha256sum] = "8624e14b873bf1ff46e2ea51e5f80459c9abf296648ac277262a836057f57d15"

S = "${WORKDIR}/rail_segmentation-release-melodic-rail_segmentation-0.1.14-1"

inherit catkin

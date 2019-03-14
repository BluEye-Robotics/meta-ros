DESCRIPTION = "ROS interface for the grid map library to manage two-dimensional grid maps with multiple data layers."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-msgs grid-map-cv sensor-msgs nav-msgs std-msgs geometry-msgs cv-bridge rosbag tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_ros/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba893bb34018aec23693370ffc844f24"
SRC_URI[sha256sum] = "bf681f58909865945e276e25c9762d8b641931b03531e92d26c1dd9dc22dcd25"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_ros-1.6.1-0"

inherit catkin

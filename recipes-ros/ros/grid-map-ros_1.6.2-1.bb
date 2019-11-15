DESCRIPTION = "ROS interface for the grid map library to manage two-dimensional grid maps with multiple data layers."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-msgs grid-map-cv sensor-msgs nav-msgs std-msgs geometry-msgs cv-bridge rosbag tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_ros/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "edaedc2cd4f579072c2742bd8051a424"
SRC_URI[sha256sum] = "4274bfc3bdf326e6bae3b1851fa6c10bd0a6a94de29a54c7bb0d3ca6c590dbf8"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_ros-1.6.2-1"

inherit catkin

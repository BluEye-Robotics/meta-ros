DESCRIPTION = "Configuration and launch files for running ROS navigation on Fetch."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "amcl base-local-planner clear-costmap-recovery costmap-2d fetch-depth-layer fetch-maps map-server move-base move-base-msgs navfn rotate-recovery slam-karto voxel-grid"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_navigation/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8d7282266db791427c6fe6e593d83ec"
SRC_URI[sha256sum] = "4436574cf785bf8a33fe225041d8d89bcddb87c9f79dd84683839d3c5bf48b20"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_navigation-0.8.0-0"

inherit catkin

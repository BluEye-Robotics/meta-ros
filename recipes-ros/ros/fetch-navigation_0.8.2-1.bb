DESCRIPTION = "Configuration and launch files for running ROS navigation on Fetch."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "amcl base-local-planner clear-costmap-recovery costmap-2d fetch-depth-layer fetch-maps map-server move-base move-base-msgs navfn rotate-recovery slam-karto voxel-grid"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_navigation/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6443cfaf3b2e2e6751957d5602016c99"
SRC_URI[sha256sum] = "255b963a72a9b38af080fad62427a9f9ed35ca395ed6d944880e1e9511d678c7"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_navigation-0.8.2-1"

inherit catkin

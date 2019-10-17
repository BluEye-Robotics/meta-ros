DESCRIPTION = "This package contains a ROS wrapper for OpenSlam's Gmapping. The gmapping package provides laser-based SLAM (Simultaneous Localization and Mapping), as a ROS node called slam_gmapping. Using slam_gmapping, you can create a 2-D occupancy grid map (like a building floorplan) from laser and pose data collected by a mobile robot."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-msgs openslam-gmapping roscpp rostest tf nodelet nav-msgs openslam-gmapping roscpp tf nodelet"

RDEPENDS_${PN} = "nav-msgs openslam-gmapping roscpp tf nodelet"

SRC_URI = "https://github.com/ros-gbp/slam_gmapping-release/archive/release/melodic/gmapping/1.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "38e282fbdc191b3f4ef92545fe23b337"
SRC_URI[sha256sum] = "0cb572f0b00c39ecc0989a195f137172cf6a3481a176bb829484d6d731a00ea1"

ROS_SPN = "slam_gmapping"
S = "${WORKDIR}/slam_gmapping-release-release-melodic-gmapping-1.4.0-1"

inherit catkin

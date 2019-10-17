DESCRIPTION = "Launchfiles to use Warthog in Gazebo."
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslaunch gazebo-ros roscpp gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins joint-state-publisher warthog-control warthog-description"

RDEPENDS_${PN} = "roscpp gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins joint-state-publisher warthog-control warthog-description"

SRC_URI = "https://github.com/clearpath-gbp/warthog_simulator-release/archive/release/melodic/warthog_gazebo/0.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "348c9cfa9f3b0405a40b948cfef12c45"
SRC_URI[sha256sum] = "ce59ffd6d91e7a09487b206b6ed2a26b0683d62eff6917ed26477f50240b3184"

ROS_SPN = "warthog_simulator"
S = "${WORKDIR}/warthog_simulator-release-release-melodic-warthog_gazebo-0.2.0-1"

inherit catkin

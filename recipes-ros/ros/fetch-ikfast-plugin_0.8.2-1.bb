DESCRIPTION = "Kinematics plugin for Fetch robot, generated through IKFast"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "tf2-kdl tf2-eigen eigen-conversions liblapack-dev moveit-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ikfast_plugin/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "098e34efbafd13980ea0cc87af3881f5"
SRC_URI[sha256sum] = "24429d173975f72b6920d831762c727198d523f38dcd462c08beae779dc72643"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_ikfast_plugin-0.8.2-1"

inherit catkin

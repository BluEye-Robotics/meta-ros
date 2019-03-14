DESCRIPTION = "Kinematics plugin for Fetch robot, generated through IKFast"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "liblapack-dev moveit-core pluginlib roscpp tf-conversions"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ikfast_plugin/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1a1dac7dc37511ea2fc1a6d3781ef515"
SRC_URI[sha256sum] = "1a89ad6b1e5c8c0c0ece9d1ac65861ee4e5654eed95361feceb152ffca78d80f"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_ikfast_plugin-0.8.0-0"

inherit catkin

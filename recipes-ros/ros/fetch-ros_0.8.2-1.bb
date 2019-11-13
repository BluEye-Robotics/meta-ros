DESCRIPTION = "Fetch ROS, packages for working with Fetch and Freight"
AUTHOR = "Alex Moriarty"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "fetch-calibration fetch-depth-layer fetch-description fetch-ikfast-plugin fetch-maps fetch-moveit-config fetch-navigation fetch-teleop"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ros/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7fd5934568ea42a182d67cc67156eb8e"
SRC_URI[sha256sum] = "280ad8771e06d8c58d969ec8266fb0ab5da3e6f55bd593b552c3c72503ae677f"

S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_ros-0.8.2-1"

inherit catkin

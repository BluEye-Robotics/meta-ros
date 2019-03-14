DESCRIPTION = "This package contains a collection of launch files that can be helpful in configuring the calibration stack to run on your robot."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "interval-intersection joint-states-settler laser-cb-detector monocam-settler urdfdom-py"

RDEPENDS_${PN} = "interval-intersection joint-states-settler laser-cb-detector monocam-settler urdfdom-py"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_launch/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94c74b3f081128faa2401f8d759d3f19"
SRC_URI[sha256sum] = "eaf7a65341c7be0665741f2d6f22d3e9d6a5a50deb004ffd402434fc2ae715b7"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_launch-0.10.14-0"

inherit catkin

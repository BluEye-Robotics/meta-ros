DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and handles unit tests, whereas rostest handles integration tests."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg roslib"

RDEPENDS_${PN} = "python-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosunit/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "414b07e9f3d158a797859581300f2f3b"
SRC_URI[sha256sum] = "145e8195fd8e46ec775d82e0c18aeb0b49e8dd20e9f042b454fecfd35044213a"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosunit-1.14.6-0"

inherit catkin

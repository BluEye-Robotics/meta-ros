DESCRIPTION = "The tuw_msgs meta package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "tuw-airskin-msgs tuw-gazebo-msgs tuw-geometry-msgs tuw-multi-robot-msgs tuw-nav-msgs tuw-object-msgs tuw-vehicle-msgs"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "36a64676d6c631fb1ba1c296992ebfc5"
SRC_URI[sha256sum] = "d220a642fe9b13209de81e68572102fffe34285934865e2ed9b8ebe9afe9baf4"

S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_msgs-0.0.13-0"

inherit catkin

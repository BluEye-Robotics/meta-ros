DESCRIPTION = "tf2_bullet"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf2 bullet geometry-msgs tf2 bullet geometry-msgs"

RDEPENDS_${PN} = "tf2 bullet geometry-msgs"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_bullet/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "09b35e945e1b43c180e72f075271c61d"
SRC_URI[sha256sum] = "2cb1d1e6d4ba180010c3f53ac138ba147ef4fb2c037d1b76be5cfb7d60ecd8e8"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_bullet-0.6.5-0"

inherit catkin

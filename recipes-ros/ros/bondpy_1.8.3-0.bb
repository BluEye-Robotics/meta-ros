DESCRIPTION = "Python implementation of bond, a mechanism for checking when another process has terminated."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond rospy smclib"

RDEPENDS_${PN} = "rospy smclib"

SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/melodic/bondpy/1.8.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df111f23a769bb2fc439bc9136499482"
SRC_URI[sha256sum] = "c7dde4bdb17c65092192cf7f2b28294b6271f6d19cf3778a90106b74f0750781"

ROS_SPN = "bond_core"
S = "${WORKDIR}/bond_core-release-release-melodic-bondpy-1.8.3-0"

inherit catkin

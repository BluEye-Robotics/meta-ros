DESCRIPTION = "ROS console output library."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apr boost cpp-common log4cxx rostime rosunit apr cpp-common log4cxx rosbuild rostime"

RDEPENDS_${PN} = "apr cpp-common log4cxx rosbuild rostime"

SRC_URI = "https://github.com/ros-gbp/rosconsole-release/archive/release/melodic/rosconsole/1.13.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d440c316445da11e5c77d55d56b1aaa"
SRC_URI[sha256sum] = "a16be47247f622748425d2165afd1a83abe00a57dbe77ef98e801bc5d64d9595"

S = "${WORKDIR}/rosconsole-release-release-melodic-rosconsole-1.13.10-0"

inherit catkin

DESCRIPTION = "Xacro (XML Macros) Xacro is an XML macro language. With xacro, you can construct shorter and more readable XML files by using macros that expand to larger XML expressions."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint roslaunch"

RDEPENDS_${PN} = "roslaunch"

SRC_URI = "https://github.com/ros-gbp/xacro-release/archive/release/melodic/xacro/1.13.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9c6d81aaa1d99befc7e36586aab12314"
SRC_URI[sha256sum] = "ef77d1f894a192888232b7b545b9f2748713066bae5c139644af3734aa09541d"

S = "${WORKDIR}/xacro-release-release-melodic-xacro-1.13.3-0"

inherit catkin

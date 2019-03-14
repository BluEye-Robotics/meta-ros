DESCRIPTION = "app_manager"
AUTHOR = "Jeremy Leibs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roslaunch rosgraph rosunit message-generation rospack rospy roslaunch rosgraph rosunit std-srvs message-runtime"

RDEPENDS_${PN} = "rospack rospy roslaunch rosgraph rosunit std-srvs message-runtime"

SRC_URI = "https://github.com/ros-gbp/app_manager-release/archive/release/melodic/app_manager/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72461f7709f8722e0cdfd730a7b795ea"
SRC_URI[sha256sum] = "1b206bd525d456027f4dcf75e78671fe6cbae7b78ebacc3707eb1d611636452c"

S = "${WORKDIR}/app_manager-release-release-melodic-app_manager-1.1.0-0"

inherit catkin

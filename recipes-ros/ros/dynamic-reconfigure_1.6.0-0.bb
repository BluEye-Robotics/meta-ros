DESCRIPTION = "This unary stack contains the dynamic_reconfigure package which provides a means to change node parameters at any time without having to restart the node."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common message-generation roscpp-serialization rostest boost roscpp std-msgs"

RDEPENDS_${PN} = "message-runtime roslib rospy rosservice"

SRC_URI = "https://github.com/ros-gbp/dynamic_reconfigure-release/archive/release/melodic/dynamic_reconfigure/1.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c6917930ea5da234891c76d187227349"
SRC_URI[sha256sum] = "00811c7ff7a43ff5dc2d22ce9bb493e55728d403f49c359606e173b687872151"

S = "${WORKDIR}/dynamic_reconfigure-release-release-melodic-dynamic_reconfigure-1.6.0-0"

inherit catkin

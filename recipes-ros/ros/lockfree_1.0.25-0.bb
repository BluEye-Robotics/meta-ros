DESCRIPTION = "The lockfree package contains lock-free data structures for use in multithreaded programming. These kinds of data structures are generally not as easy to use as single-threaded equivalents, and are not always faster. If you don't know you need to use one, try another structure with a lock around it first."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosatomic rosconsole roslib allocators rosatomic rosconsole roslib allocators"

RDEPENDS_${PN} = "rosatomic rosconsole roslib allocators"

SRC_URI = "https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/lockfree/1.0.25-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a039a910dd86e18e45037fbe6fbaa189"
SRC_URI[sha256sum] = "659c8d7707b844cc4c8c9eeab40e3e33fdd65f1ca0e07f71b471dd4dad633e4f"

ROS_SPN = "ros_realtime"
S = "${WORKDIR}/ros_realtime-release-release-melodic-lockfree-1.0.25-0"

inherit catkin

DESCRIPTION = "Contains a set of tools that can be used from a hard realtime thread, without breaking the realtime behavior. The tools currently only provides the realtime publisher, which makes it possible to publish messages to a ROS topic from a realtime thread. We plan to add a basic implementation of a realtime buffer, to make it possible to get data from a (non-realtime) topic callback into the realtime loop. Once the lockfree buffer is created, the realtime publisher will start using it, which will result in major API changes for the realtime publisher (removal of all lock methods)."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy roscpp rospy"

RDEPENDS_${PN} = "roscpp rospy"

SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/melodic/realtime_tools/1.13.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "81dc82a9e2f3045d8cd5d81fdafa3860"
SRC_URI[sha256sum] = "399aca3a72c59e2bd7bfc508e7dca8cb53d95ee76f067f4b11ecdaa49ea7e225"

S = "${WORKDIR}/realtime_tools-release-release-melodic-realtime_tools-1.13.1-0"

inherit catkin

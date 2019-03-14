DESCRIPTION = "The ddynamic_reconfigure_python package contains a class to instantiate dynamic reconfigure servers on the fly registering variables"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure rospy dynamic-reconfigure rospy"

RDEPENDS_${PN} = "dynamic-reconfigure rospy"

SRC_URI = "https://github.com/pal-gbp/ddynamic_reconfigure_python-release/archive/release/melodic/ddynamic_reconfigure_python/0.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1bf35dca956a27b59619382126239f08"
SRC_URI[sha256sum] = "bc8dcf50274a8e4a0548a9044f4af8ef90d207eab61b8a3ff4e474582b88121c"

S = "${WORKDIR}/ddynamic_reconfigure_python-release-release-melodic-ddynamic_reconfigure_python-0.0.1-0"

inherit catkin

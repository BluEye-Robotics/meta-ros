DESCRIPTION = "The md49_base_controller package"
AUTHOR = "Fabian Prinzing"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs roscpp rospy std-msgs md49-messages md49-serialport message-runtime geometry-msgs roscpp rospy std-msgs md49-messages md49-serialport"

RDEPENDS_${PN} = "message-runtime geometry-msgs roscpp rospy std-msgs md49-messages md49-serialport"

SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/melodic/md49_base_controller/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "45b384ab5b88825628e499ed1e0385dd"
SRC_URI[sha256sum] = "dc2871ad616ad8cefde86ba1025f9b5d06059328741d2850d5503770f95700ac"

S = "${WORKDIR}/md49_base_controller-release-release-melodic-md49_base_controller-0.1.4-1"

inherit catkin

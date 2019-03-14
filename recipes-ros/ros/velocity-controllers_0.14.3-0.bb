DESCRIPTION = "velocity_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/velocity_controllers/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7288fcb162cb241af28c346bc696321"
SRC_URI[sha256sum] = "f3c0c8d380a7946264056606e4949100e25b13cbb85ec6692a9d162552ff1344"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-velocity_controllers-0.14.3-0"

inherit catkin

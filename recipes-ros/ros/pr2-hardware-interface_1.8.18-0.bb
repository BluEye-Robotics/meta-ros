DESCRIPTION = "This package contains the C++ interfaces to the PR2 hardware components that are controlled over EtherCAT. This includes the motors and encoders needed to control the PR2 mechanism, as well as components like the pressure sensors in the fingertips, camera triggers, etc. . . All of the hardware components in this interface are directly available to the controllers inside the hard realtime control loop."
AUTHOR = "Eric Berger berger@willowgarage.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs roscpp geometry-msgs"

RDEPENDS_${PN} = "roscpp geometry-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_hardware_interface/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f902caa7b9a308983ff0eea8fbc4e677"
SRC_URI[sha256sum] = "abbcd1c6b4af9419057f2bb0b7f7677943e16e03abdd15933e41efdc16975247"

ROS_SPN = "pr2_mechanism"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_hardware_interface-1.8.18-0"

inherit catkin

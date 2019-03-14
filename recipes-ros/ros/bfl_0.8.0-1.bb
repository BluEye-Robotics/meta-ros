DESCRIPTION = "This package contains a recent version of the Bayesian Filtering Library (BFL), distributed by the Orocos Project. For stability reasons, this package is currently locked to revision 31655 (April 19, 2010), but this revision will be updated on a regular basis to the latest available BFL trunk. This ROS package does not modify BFL in any way, it simply provides a convenient way to download and compile the library, because BFL is not available from an OS package manager. This ROS package compiles BFL with the Boost library for matrix operations and random number generation."
AUTHOR = "Klaas Gadeyne, Wim Meeussen, Tinne Delaet and many others. See web page for a full contributor list. ROS package maintained by Wim Meeussen."
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "cppunit ros catkin cppunit ros"

RDEPENDS_${PN} = "catkin cppunit ros"

SRC_URI = "https://github.com/ros-gbp/bfl-release/archive/release/melodic/bfl/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22d32d2877f10884bcfa0bf831c79846"
SRC_URI[sha256sum] = "7c4c61c15768d1cd276cdaaf9a9f5e3088f478383789ffec9fdee325dafc0990"

S = "${WORKDIR}/bfl-release-release-melodic-bfl-0.8.0-1"

inherit catkin

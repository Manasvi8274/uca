import mongoose from "mongoose";

try {
  await mongoose.connect(
    "mongodb+srv://manasvi1238274:Manasvi1238274@cluster0.p8zho.mongodb.net/classprojectdatabase"
  );
  console.log("Db Connection success")
} catch (error) {
    console.error("DB connection failed with error: ", error)
}
